# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class DocstringComment(Base):
    __tablename__ = "docstring_comment"

    element_oid = Column(Integer, primary_key=True)
    text = Column(Text, nullable=False)
    documented_element_oid = Column(Integer, nullable=False)
