# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Comment(Base):
    __tablename__ = "comment"

    element_oid = Column(Integer, primary_key=True)
    text = Column(Text, nullable=False)
    parent_oid = Column(Integer, nullable=False)
    location_oid = Column(Integer, nullable=False)
