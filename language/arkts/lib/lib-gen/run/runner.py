# -*-coding:utf-8-*-

import logging
import select
import shlex
import subprocess
import time


def output_stream(process, timeout):
    start_time = time.time()
    while True:
        # 检查超时
        current_time = time.time()
        if current_time - start_time >= timeout:
            logging.error("Execution timeout, You can add -t option to adjust timeout")
            process.kill()
            break
        # 检查子进程的stdout是否可读
        rlist, _, _ = select.select([process.stdout], [], [], 1)
        if rlist:
            output = process.stdout.readline()
            if output:
                print(output.strip())
            else:
                # 没有更多输出，进程可能已经结束
                break
        else:
            # select超时，没有可用输出，继续循环
            continue
    # 等待进程结束并获取退出码
    process.wait()


class Runner:
    def __init__(self, cmd, timeout_seconds):
        self.cmd = cmd
        self.timeout_seconds = timeout_seconds

    def subrun(self, output=None):
        print("execute : %s", shlex.join(self.cmd))
        process = None
        return_code = -1
        try:
            process = subprocess.Popen(self.cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT,
                                       encoding="utf-8")
            if output is None:
                output = output_stream
            output(process, self.timeout_seconds)
            return_code = process.wait()
        except Exception as e:
            print("execute error: %s", e)
            return -1
        finally:
            if process:
                process.kill()
            return return_code
