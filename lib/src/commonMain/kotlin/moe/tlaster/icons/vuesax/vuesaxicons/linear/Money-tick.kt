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

public val LinearGroup.`Money-tick`: ImageVector
    get() {
        if (`_money-tick` != null) {
            return `_money-tick`!!
        }
        `_money-tick` = Builder(name = "Money-tick", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.0f, 18.0f)
                curveTo(9.0f, 18.75f, 8.79f, 19.46f, 8.42f, 20.06f)
                curveTo(7.73f, 21.22f, 6.46f, 22.0f, 5.0f, 22.0f)
                curveTo(3.54f, 22.0f, 2.27f, 21.22f, 1.58f, 20.06f)
                curveTo(1.21f, 19.46f, 1.0f, 18.75f, 1.0f, 18.0f)
                curveTo(1.0f, 15.79f, 2.79f, 14.0f, 5.0f, 14.0f)
                curveTo(7.21f, 14.0f, 9.0f, 15.79f, 9.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4414f, 17.9995f)
                lineTo(4.4314f, 18.9895f)
                lineTo(6.5614f, 17.0195f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.3f)
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
        return `_money-tick`!!
    }

private var `_money-tick`: ImageVector? = null
