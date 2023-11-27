# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class BooleanOpExpression(Base):
    __tablename__ = "boolean_op_expression"

    element_oid = Column(Integer, primary_key=True)
    type = Column(Text, nullable=False)
    size = Column(Integer, nullable=False)
