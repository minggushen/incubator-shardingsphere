package io.shardingsphere.core.parsing.antlr.sql.statement;

import io.shardingsphere.core.constant.SQLType;
import io.shardingsphere.core.parsing.parser.sql.AbstractSQLStatement;


public class CommentStatement extends AbstractSQLStatement {

    public CommentStatement(SQLType type) {
        super(type);
    }
}
