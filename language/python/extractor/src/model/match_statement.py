# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class MatchStatement(Base):
    __tablename__ = "match_statement"

    element_oid = Column(Integer, primary_key=True)
    subject_oid = Column(Integer, nullable=False)
