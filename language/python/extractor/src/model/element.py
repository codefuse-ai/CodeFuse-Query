# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Element(Base):
    __tablename__ = "element"

    oid = Column(Integer, primary_key=True)
    value = Column(Text, nullable=False)
    type = Column(Text, nullable=False)
    parent_oid = Column(Integer, nullable=False)
