# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class AwaitExpression(Base):
    __tablename__ = "await_expression"

    element_oid = Column(Integer, primary_key=True)
    expr_value_oid = Column(Integer, nullable=False)
