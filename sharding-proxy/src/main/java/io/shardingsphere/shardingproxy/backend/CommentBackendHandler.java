package io.shardingsphere.shardingproxy.backend;

import io.shardingsphere.shardingproxy.transport.mysql.packet.command.CommandResponsePackets;
import io.shardingsphere.shardingproxy.transport.mysql.packet.generic.OKPacket;

public final class CommentBackendHandler extends AbstractBackendHandler{
    @Override
    protected CommandResponsePackets execute0(){
         //该处实现这种解释语言的返回值，直接返回成功即可
        return new CommandResponsePackets(new OKPacket(1));
    }
}
