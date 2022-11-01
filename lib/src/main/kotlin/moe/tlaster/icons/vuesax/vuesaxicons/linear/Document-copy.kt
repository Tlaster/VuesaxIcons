package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Document-copy`: ImageVector
    get() {
        if (`_document-copy` != null) {
            return `_document-copy`!!
        }
        `_document-copy` = Builder(name = "Document-copy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 13.4f)
                verticalLineTo(16.4f)
                curveTo(17.0f, 20.4f, 15.4f, 22.0f, 11.4f, 22.0f)
                horizontalLineTo(7.6f)
                curveTo(3.6f, 22.0f, 2.0f, 20.4f, 2.0f, 16.4f)
                verticalLineTo(12.6f)
                curveTo(2.0f, 8.6f, 3.6f, 7.0f, 7.6f, 7.0f)
                horizontalLineTo(10.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 13.4f)
                horizontalLineTo(13.8f)
                curveTo(11.4f, 13.4f, 10.6f, 12.6f, 10.6f, 10.2f)
                verticalLineTo(7.0f)
                lineTo(17.0f, 13.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.6f, 2.0f)
                horizontalLineTo(15.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 3.34f, 8.34f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(12.62f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9999f, 8.0f)
                verticalLineTo(14.19f)
                curveTo(21.9999f, 15.74f, 20.7399f, 17.0f, 19.1899f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                horizontalLineTo(19.0f)
                curveTo(16.75f, 8.0f, 16.0f, 7.25f, 16.0f, 5.0f)
                verticalLineTo(2.0f)
                lineTo(22.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_document-copy`!!
    }

private var `_document-copy`: ImageVector? = null
