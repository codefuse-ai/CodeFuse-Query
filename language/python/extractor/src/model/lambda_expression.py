# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class LambdaExpression(Base):
    __tablename__ = "lambda_expression"

    element_oid = Column(Integer, primary_key=True)
