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

public val LinearGroup.`Document-like`: ImageVector
    get() {
        if (`_document-like` != null) {
            return `_document-like`!!
        }
        `_document-like` = Builder(name = "Document-like", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 20.0f, 19.5f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(4.5f, 22.0f, 3.0f, 20.0f, 3.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 4.0f, 4.5f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(19.5f, 2.0f, 21.0f, 4.0f, 21.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(14.5f, 7.6f, 15.4f, 8.5f, 16.5f, 8.5f)
                horizontalLineTo(18.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.48f, 15.4901f)
                curveTo(7.15f, 14.4601f, 7.54f, 13.1901f, 8.61f, 12.8401f)
                curveTo(9.18f, 12.6601f, 9.88f, 12.8101f, 10.27f, 13.3601f)
                curveTo(10.64f, 12.7901f, 11.37f, 12.6601f, 11.93f, 12.8401f)
                curveTo(13.01f, 13.1901f, 13.39f, 14.4601f, 13.07f, 15.4901f)
                curveTo(12.56f, 17.1201f, 10.77f, 17.9701f, 10.27f, 17.9701f)
                curveTo(9.78f, 17.9601f, 8.01f, 17.1301f, 7.48f, 15.4901f)
                close()
            }
        }
        .build()
        return `_document-like`!!
    }

private var `_document-like`: ImageVector? = null
