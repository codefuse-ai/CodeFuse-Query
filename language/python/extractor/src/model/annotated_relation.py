# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class AnnotatedRelation(Base):
    __tablename__ = "annotated_relation"

    annotation_oid = Column(Integer, primary_key=True)
    annotated_item_oid = Column(Integer, nullable=False)
