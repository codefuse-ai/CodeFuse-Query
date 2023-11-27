# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class CallExpression(Base):
    __tablename__ = "call_expression"

    element_oid = Column(Integer, primary_key=True)
    expr_func_oid = Column(Integer, nullable=False)
