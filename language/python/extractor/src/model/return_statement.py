# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ReturnStatement(Base):
    __tablename__ = "return_statement"

    element_oid = Column(Integer, primary_key=True)
    is_return_empty = Column(Integer, nullable=False)
