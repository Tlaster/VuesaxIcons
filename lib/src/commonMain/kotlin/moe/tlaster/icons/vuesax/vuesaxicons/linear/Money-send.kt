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

public val LinearGroup.`Money-send`: ImageVector
    get() {
        if (`_money-send` != null) {
            return `_money-send`!!
        }
        `_money-send` = Builder(name = "Money-send", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 13.75f)
                curveTo(9.5f, 14.72f, 10.25f, 15.5f, 11.17f, 15.5f)
                horizontalLineTo(13.05f)
                curveTo(13.85f, 15.5f, 14.5f, 14.82f, 14.5f, 13.97f)
                curveTo(14.5f, 13.06f, 14.1f, 12.73f, 13.51f, 12.52f)
                lineTo(10.5f, 11.47f)
                curveTo(9.91f, 11.26f, 9.51f, 10.94f, 9.51f, 10.02f)
                curveTo(9.51f, 9.18f, 10.16f, 8.49f, 10.96f, 8.49f)
                horizontalLineTo(12.84f)
                curveTo(13.76f, 8.49f, 14.51f, 9.27f, 14.51f, 10.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.5f)
                verticalLineTo(16.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                lineTo(22.0f, 2.0f)
            }
        }
        .build()
        return `_money-send`!!
    }

private var `_money-send`: ImageVector? = null
