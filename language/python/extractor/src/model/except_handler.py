# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ExceptHandler(Base):
    __tablename__ = "except_handler"

    element_oid = Column(Integer, primary_key=True)
    element_index = Column(Integer, nullable=False)
    parent_oid = Column(Integer, nullable=False)
    location_oid = Column(Integer, nullable=False)
    printable_text = Column(Text, nullable=False)
