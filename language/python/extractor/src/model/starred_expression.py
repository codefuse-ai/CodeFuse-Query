# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class StarredExpression(Base):
    __tablename__ = "starred_expression"

    element_oid = Column(Integer, primary_key=True)
    ctx = Column(Text, nullable=False)
