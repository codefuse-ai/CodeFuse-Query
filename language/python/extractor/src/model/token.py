# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Token(Base):
    __tablename__ = "token"

    element_oid = Column(Integer, primary_key=True)
    value = Column(Text, nullable=False)
    location_oid = Column(Integer)
    parent_oid = Column(Integer)
