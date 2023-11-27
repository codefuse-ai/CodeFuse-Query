# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class AsyncFunctionDefStatement(Base):
    __tablename__ = "async_function_def_statement"

    element_oid = Column(Integer, primary_key=True)
    name = Column(Text, nullable=False)
