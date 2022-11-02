package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Paintbucket: ImageVector
    get() {
        if (_paintbucket != null) {
            return _paintbucket!!
        }
        _paintbucket = Builder(name = "Paintbucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.7706f, 15.56f)
                lineTo(7.2306f, 19.02f)
                curveTo(9.6606f, 21.45f, 10.4906f, 21.41f, 12.8906f, 19.02f)
                lineTo(18.4606f, 13.45f)
                curveTo(20.4006f, 11.51f, 20.8906f, 10.22f, 18.4606f, 7.79f)
                lineTo(15.0006f, 4.33f)
                curveTo(12.4106f, 1.74f, 11.2806f, 2.39f, 9.3406f, 4.33f)
                lineTo(3.7706f, 9.9f)
                curveTo(1.3806f, 12.3f, 1.1806f, 12.97f, 3.7706f, 15.56f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1995f, 16.79f)
                lineTo(18.5395f, 17.88f)
                curveTo(17.6095f, 19.43f, 18.3295f, 20.7f, 20.1395f, 20.7f)
                curveTo(21.9495f, 20.7f, 22.6695f, 19.43f, 21.7395f, 17.88f)
                lineTo(21.0795f, 16.79f)
                curveTo(20.5595f, 15.93f, 19.7095f, 15.93f, 19.1995f, 16.79f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.2398f)
                curveTo(7.56f, 10.7298f, 13.42f, 10.6798f, 19.0f, 12.1098f)
                lineTo(19.5f, 12.2398f)
            }
        }
        .build()
        return _paintbucket!!
    }

private var _paintbucket: ImageVector? = null
