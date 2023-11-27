# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Decorator(Base):
    __tablename__ = "decorator"

    element_oid = Column(Integer, primary_key=True)
    type = Column(Text, nullable=False)
    printable_text = Column(Text, nullable=False)
