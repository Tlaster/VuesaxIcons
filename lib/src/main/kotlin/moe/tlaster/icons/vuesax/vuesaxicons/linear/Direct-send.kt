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

public val LinearGroup.`Direct-send`: ImageVector
    get() {
        if (`_direct-send` != null) {
            return `_direct-send`!!
        }
        `_direct-send` = Builder(name = "Direct-send", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(2.0f)
                lineTo(10.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(14.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.98f, 13.0f)
                horizontalLineTo(6.39f)
                curveTo(6.77f, 13.0f, 7.11f, 13.21f, 7.28f, 13.55f)
                lineTo(8.45f, 15.89f)
                curveTo(8.79f, 16.57f, 9.48f, 17.0f, 10.24f, 17.0f)
                horizontalLineTo(13.77f)
                curveTo(14.53f, 17.0f, 15.22f, 16.57f, 15.56f, 15.89f)
                lineTo(16.73f, 13.55f)
                curveTo(16.9f, 13.21f, 17.25f, 13.0f, 17.62f, 13.0f)
                horizontalLineTo(21.98f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 5.1299f)
                curveTo(3.46f, 5.6499f, 2.0f, 7.7299f, 2.0f, 11.9999f)
                verticalLineTo(14.9999f)
                curveTo(2.0f, 19.9999f, 4.0f, 21.9999f, 9.0f, 21.9999f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 21.9999f, 22.0f, 19.9999f, 22.0f, 14.9999f)
                verticalLineTo(11.9999f)
                curveTo(22.0f, 7.7299f, 20.54f, 5.6499f, 17.0f, 5.1299f)
            }
        }
        .build()
        return `_direct-send`!!
    }

private var `_direct-send`: ImageVector? = null
