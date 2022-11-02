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

public val TwotoneGroup.Cardtick: ImageVector
    get() {
        if (_cardtick != null) {
            return _cardtick!!
        }
        _cardtick = Builder(name = "Cardtick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 10.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5502f, 20.4998f)
                horizontalLineTo(6.4402f)
                curveTo(2.8902f, 20.4998f, 1.9902f, 19.6198f, 1.9902f, 16.1098f)
                verticalLineTo(7.8898f)
                curveTo(1.9902f, 4.7098f, 2.7303f, 3.6898f, 5.5203f, 3.5298f)
                curveTo(5.8003f, 3.5198f, 6.1102f, 3.5098f, 6.4402f, 3.5098f)
                horizontalLineTo(17.5502f)
                curveTo(21.1002f, 3.5098f, 22.0002f, 4.3898f, 22.0002f, 7.8998f)
                verticalLineTo(12.3098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 16.0f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                curveTo(22.0f, 18.75f, 21.79f, 19.46f, 21.42f, 20.06f)
                curveTo(20.73f, 21.22f, 19.46f, 22.0f, 18.0f, 22.0f)
                curveTo(16.54f, 22.0f, 15.27f, 21.22f, 14.58f, 20.06f)
                curveTo(14.21f, 19.46f, 14.0f, 18.75f, 14.0f, 18.0f)
                curveTo(14.0f, 15.79f, 15.79f, 14.0f, 18.0f, 14.0f)
                curveTo(20.21f, 14.0f, 22.0f, 15.79f, 22.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4395f, 18.0f)
                lineTo(17.4294f, 18.99f)
                lineTo(19.5594f, 17.02f)
            }
        }
        .build()
        return _cardtick!!
    }

private var _cardtick: ImageVector? = null
