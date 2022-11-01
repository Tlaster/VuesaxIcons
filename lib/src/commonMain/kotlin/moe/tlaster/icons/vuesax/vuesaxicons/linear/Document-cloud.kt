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

public val LinearGroup.`Document-cloud`: ImageVector
    get() {
        if (`_document-cloud` != null) {
            return `_document-cloud`!!
        }
        `_document-cloud` = Builder(name = "Document-cloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(15.0f, 10.0f, 14.0f, 9.0f, 14.0f, 6.0f)
                verticalLineTo(2.0f)
                lineTo(22.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.7601f, 18.2601f)
                curveTo(11.4101f, 18.4301f, 11.4101f, 21.8301f, 13.7601f, 22.0001f)
                horizontalLineTo(19.3201f)
                curveTo(19.9901f, 22.0001f, 20.6501f, 21.7501f, 21.1401f, 21.3001f)
                curveTo(22.7901f, 19.8601f, 21.9101f, 16.9801f, 19.7401f, 16.7101f)
                curveTo(18.9601f, 12.0201f, 12.1801f, 13.8001f, 13.7801f, 18.2701f)
            }
        }
        .build()
        return `_document-cloud`!!
    }

private var `_document-cloud`: ImageVector? = null
