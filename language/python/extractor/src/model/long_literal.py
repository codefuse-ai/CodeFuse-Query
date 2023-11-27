# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class LongLiteral(Base):
    __tablename__ = "long_literal"

    element_oid = Column(Integer, primary_key=True)
    value = Column(Text, nullable=False)
