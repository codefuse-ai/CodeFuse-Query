# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ExprContext(Base):
    __tablename__ = "expr_context"

    element_oid = Column(Integer, primary_key=True)
    parent_oid = Column(Integer, nullable=False)
    printable_text = Column(Text, nullable=False)
