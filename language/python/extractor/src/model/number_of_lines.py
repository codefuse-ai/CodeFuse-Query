# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class NumberOfLines(Base):
    __tablename__ = "number_of_lines"

    element_oid = Column(Integer, primary_key=True)
    number_of_total_lines = Column(Integer)
    number_of_valid_lines = Column(Integer)
    number_of_comment_lines = Column(Integer)
