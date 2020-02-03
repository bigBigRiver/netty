package com.river.netty;

import com.river.netty.server.HttpServer;
import com.river.netty.util.PropertiesUtil;

import java.util.Objects;

/**
 * @author river
 * 2020/02/02
 */
public class NettyApplication {

    /**
     * 文件下载路径
     */
    private static final String FILE_PATH = "/" + PropertiesUtil.getValue("filePath");

    /**
     * http服务端口
     */
    private static final int port = Integer.parseInt(Objects.requireNonNull(PropertiesUtil.getValue("serverPort")));

    public static void main(String[] args) {

        HttpServer.run(port, FILE_PATH);

    }
}
