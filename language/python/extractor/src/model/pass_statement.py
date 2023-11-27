# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class PassStatement(Base):
    __tablename__ = "pass_statement"

    element_oid = Column(Integer, primary_key=True)
