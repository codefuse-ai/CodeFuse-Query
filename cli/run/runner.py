# -*-coding:utf-8-*-

import logging
import shlex
import subprocess
import threading


def stream_reader(stream, handler):
    for line in iter(stream.readline, ''):
        handler(line)
    stream.close()


def log_info(message):
    logging.info(message.strip())


def log_error(message):
    logging.error(message.strip())


def terminate_process(proc, timeout, timers):
    """终止进程并取消所有超时器"""
    if proc.poll() is None:  # 如果进程没有结束
        proc.kill()
        proc.terminate()  # 尝试终端
        logger = logging.getLogger()
        for hdlr in logger.handlers:
            hdlr.setFormatter(logging.Formatter('%(asctime)s %(levelname)s: %(message)s'))
        logging.error("Execution timeout, You can add -t option to adjust timeout")

    # 取消所有定时器
    for timer in timers:
        timer.cancel()


class Runner:
    def __init__(self, cmd, timeout_seconds):
        self.cmd = cmd
        self.timeout_seconds = timeout_seconds

    def subrun(self, info_out=None, error_out=None):
        logging.info("execute : %s", shlex.join(self.cmd))
        process = None
        return_code = -1
        try:
            process = subprocess.Popen(
                self.cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE,
                encoding="utf-8", bufsize=1, text=True
            )

            logger = logging.getLogger()
            for hdlr in logger.handlers:
                hdlr.setFormatter(logging.Formatter('%(message)s'))
            if not info_out:
                info_out = log_info
            if not error_out:
                error_out = log_error

            # 为超时创建一个Timer并开始计时
            timeout_timer = threading.Timer(self.timeout_seconds, terminate_process,
                                            [process, self.timeout_seconds, []])

            stdout_thread = threading.Thread(target=stream_reader, args=(process.stdout, info_out))
            stderr_thread = threading.Thread(target=stream_reader, args=(process.stderr, error_out))

            stdout_thread.start()
            stderr_thread.start()

            timeout_timer.start()  # 启动超时计时器

            # 主线程等待子进程结束
            return_code = process.wait()

            # 子进程结束后取消超时计时器
            timeout_timer.cancel()

            # 等待读取子进程的输出/错误的线程可以正确结束
            stdout_thread.join()
            stderr_thread.join()
            return_code = process.wait()
        except Exception as e:
            logging.error("execute error: %s", e)
            return -1
        finally:
            logger = logging.getLogger()
            for hdlr in logger.handlers:
                hdlr.setFormatter(logging.Formatter('%(asctime)s %(levelname)s: %(message)s'))
            if process:
                process.kill()
            return return_code
