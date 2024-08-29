FROM ubuntu:22.04

# use tsinghua sources to accelete in China
RUN echo "deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy main restricted universe multiverse\n\
deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy-updates main restricted universe multiverse\n\
deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy-backports main restricted universe multiverse\n\
deb http://security.ubuntu.com/ubuntu/ jammy-security main restricted universe multiverse" > /etc/apt/sources.list

RUN apt update && apt install -y cmake wget llvm-13 clang-13 libclang-13-dev libsqlite3-dev sqlite3 zlib1g-dev

RUN update-alternatives --install /usr/bin/llvm-config llvm-config /usr/bin/llvm-config-13 100 \ 
    && update-alternatives --install /usr/bin/clang clang /usr/bin/clang-13 100 \
    && update-alternatives --install /usr/bin/clang++ clang++ /usr/bin/clang++-13 100






