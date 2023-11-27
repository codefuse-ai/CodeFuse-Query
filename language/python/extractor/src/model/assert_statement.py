# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class AssertStatement(Base):
    __tablename__ = "assert_statement"

    element_oid = Column(Integer, primary_key=True)
    assert_condition_oid = Column(Integer, nullable=False)
