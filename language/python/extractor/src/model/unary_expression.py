# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class UnaryExpression(Base):
    __tablename__ = "unary_expression"

    element_oid = Column(Integer, primary_key=True)
    operand_oid = Column(Integer, nullable=False)
    opcode = Column(Text, nullable=False)
    is_postfix = Column(Integer, nullable=False)
