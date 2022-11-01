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

public val LinearGroup.`Money-time`: ImageVector
    get() {
        if (`_money-time` != null) {
            return `_money-time`!!
        }
        `_money-time` = Builder(name = "Money-time", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.5f)
                curveTo(13.3807f, 14.5f, 14.5f, 13.3807f, 14.5f, 12.0f)
                curveTo(14.5f, 10.6193f, 13.3807f, 9.5f, 12.0f, 9.5f)
                curveTo(10.6193f, 9.5f, 9.5f, 10.6193f, 9.5f, 12.0f)
                curveTo(9.5f, 13.3807f, 10.6193f, 14.5f, 12.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 9.5f)
                verticalLineTo(14.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveTo(7.2091f, 22.0f, 9.0f, 20.2091f, 9.0f, 18.0f)
                curveTo(9.0f, 15.7909f, 7.2091f, 14.0f, 5.0f, 14.0f)
                curveTo(2.7909f, 14.0f, 1.0f, 15.7909f, 1.0f, 18.0f)
                curveTo(1.0f, 20.2091f, 2.7909f, 22.0f, 5.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 16.75f)
                verticalLineTo(17.68f)
                curveTo(5.25f, 18.03f, 5.07f, 18.36f, 4.76f, 18.54f)
                lineTo(4.0f, 19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.2f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 5.5f, 4.0f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 4.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 18.5f, 20.0f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(8.5f)
            }
        }
        .build()
        return `_money-time`!!
    }

private var `_money-time`: ImageVector? = null
