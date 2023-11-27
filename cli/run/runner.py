import logging
import subprocess
import threading
import shlex


def output_stream(stream):
    for line in iter(stream.readline, b''):
        output = line.strip()
        if output:
            print(output)


class Runner:
    def __init__(self, cmd, timeout_seconds):
        self.cmd = cmd
        self.timeout_seconds = timeout_seconds

    def subrun(self, output=None):
        logging.info("execute : %s", shlex.join(self.cmd))
        try:
            process = subprocess.Popen(self.cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT,
                                       encoding="utf-8")
            if output is None:
                output = output_stream
            output_thread = threading.Thread(target=output, args=(process.stdout,))
            output_thread.daemon = True  # 设置为守护线程
            output_thread.start()

            process.wait(timeout=self.timeout_seconds)

            if process.returncode is None:
                # 超时处理
                process.kill()
                logging.error("execute time > %s s, time out, You can add -t option to adjust timeout",
                              self.timeout_seconds)
            return_code = process.wait()
            return return_code
        except Exception as e:
            logging.error("execute error: %s", e)
            return -1
