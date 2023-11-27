# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class BinOpExpression(Base):
    __tablename__ = "bin_op_expression"

    element_oid = Column(Integer, primary_key=True)
    left_expr_oid = Column(Integer, nullable=False)
    opcode = Column(Integer, nullable=False)
    right_expr_oid = Column(Integer, nullable=False)
