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

public val LinearGroup.`Path-square`: ImageVector
    get() {
        if (`_path-square` != null) {
            return `_path-square`!!
        }
        `_path-square` = Builder(name = "Path-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.75f, 9.12f)
                lineTo(14.9f, 7.27f)
                curveTo(14.2f, 6.57f, 13.24f, 6.61f, 12.77f, 7.35f)
                lineTo(11.74f, 8.98f)
                lineTo(15.03f, 12.27f)
                lineTo(16.66f, 11.24f)
                curveTo(17.37f, 10.8f, 17.41f, 9.77f, 16.75f, 9.12f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.74f, 8.9799f)
                lineTo(9.35f, 8.8399f)
                curveTo(8.01f, 8.7599f, 7.55f, 9.1699f, 7.4f, 10.4399f)
                lineTo(6.8f, 15.5099f)
                curveTo(6.67f, 16.5799f, 7.44f, 17.3399f, 8.51f, 17.2199f)
                lineTo(13.58f, 16.6199f)
                curveTo(14.85f, 16.4699f, 15.31f, 16.0099f, 15.18f, 14.6699f)
                lineTo(15.04f, 12.2799f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.49f, 16.5199f)
                lineTo(9.34f, 14.6699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_path-square`!!
    }

private var `_path-square`: ImageVector? = null
