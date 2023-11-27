# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ExpressionStatement(Base):
    __tablename__ = "expression_statement"

    element_oid = Column(Integer, primary_key=True)
    value_oid = Column(Integer, nullable=False)
