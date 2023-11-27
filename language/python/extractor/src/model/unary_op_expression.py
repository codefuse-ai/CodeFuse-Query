# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class UnaryOpExpression(Base):
    __tablename__ = "unary_op_expression"

    element_oid = Column(Integer, primary_key=True)
    op_code = Column(Text, nullable=False)
    operand_oid = Column(Integer, nullable=False)
