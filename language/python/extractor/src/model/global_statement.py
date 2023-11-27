# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class GlobalStatement(Base):
    __tablename__ = "global_statement"

    element_oid = Column(Integer, primary_key=True)
    names = Column(Text, nullable=False)
