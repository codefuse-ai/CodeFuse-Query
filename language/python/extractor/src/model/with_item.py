# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class WithItem(Base):
    __tablename__ = "with_item"

    element_oid = Column(Integer, primary_key=True)
    printable_text = Column(Text, nullable=False)
    element_index = Column(Integer, nullable=False)
    parent_oid = Column(Integer, nullable=False)
