#!/usr/bin/env bash

function main() {
  if [ "$1" = "config" ]; then
    config
  elif [ "$1" = "upload" ]; then
    upload
  fi
}

OSSUTIL_BIN=$HOME/.local/bin/ossutil
OSS_CONFIG_FILE=$HOME/myconfig

function config() {
    mkdir -p $HOME/.local/bin
    if [ $OS = "linux" ]; then
      URL=https://gosspublic.alicdn.com/ossutil/1.7.3/ossutil64
    elif [ $OS = "osx" ]; then
      URL=https://gosspublic.alicdn.com/ossutil/1.7.3/ossutilmac64
    fi

    curl $URL -o $OSSUTIL_BIN
    chmod 755 $OSSUTIL_BIN
    $OSSUTIL_BIN config -e cn-shanghai-alipay-office.oss-alipay.aliyuncs.com -i ${ACI_VAR_OSS_KEYID} -k ${ACI_VAR_OSS_KEYSECRET} -L CH -c $OSS_CONFIG_FILE
}

function upload() {
    OSS_URL=oss://antsys-sparrow-data/sparrow/public/${OS}-${OSS_TARGET_BASENAME}
    OSS_FILENAME=${OSS_TARGET_BASENAME}-${VERSION}.tar.gz
    $OSSUTIL_BIN cp -rf ${OUTPUT_FILE} ${OSS_URL}/${OSS_FILENAME} -c $OSS_CONFIG_FILE --jobs 16
    if [ "$VERSION" != "snapshot" ]; then
        if test -z "${LATEST}"; then
            echo "not set latest tag"
        else
            echo -e "$VERSION\c" > latest
            $OSSUTIL_BIN cp -rf latest ${OSS_URL}/ -c $OSS_CONFIG_FILE --jobs 16
        fi
    fi
}

main "$1"
