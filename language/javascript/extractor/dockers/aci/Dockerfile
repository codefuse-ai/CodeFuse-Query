FROM node:16

RUN npm config set registry https://registry.npmmirror.com

# 拷贝pkg打包需要的node缓存
COPY fetched-v16.13.2-linux-x64 /root/.pkg-cache/v3.2/
COPY fetched-v16.13.2-macos-x64 /root/.pkg-cache/v3.2/

RUN wget http://gosspublic.alicdn.com/ossutil/1.7.1/ossutil64 -O /bin/ossutil
RUN chmod 755 /bin/ossutil
