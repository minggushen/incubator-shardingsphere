package io.shardingsphere.shardingproxy.backend;

import io.shardingsphere.shardingproxy.transport.mysql.packet.command.CommandResponsePackets;
import io.shardingsphere.shardingproxy.transport.mysql.packet.generic.OKPacket;

public final class CommentBackendHandler extends AbstractBackendHandler{
    @Override
    protected CommandResponsePackets execute0(){
         //该处实现这种解释语言的返回值，直接返回成功即可,但是info并不能打印出来！在当前后端打印好了
        return new CommandResponsePackets(new OKPacket(1, 0L, 0L, 1,
                                "分库后的mysql不支持任何注释语言！也无法使用@@等！"));
    }
}
