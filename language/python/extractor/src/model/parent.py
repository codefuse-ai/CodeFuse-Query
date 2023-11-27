# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Parent(Base):
    __tablename__ = "parent"

    parent_oid = Column(Integer, primary_key=True)
    parent_type = Column(Text, nullable=False)
