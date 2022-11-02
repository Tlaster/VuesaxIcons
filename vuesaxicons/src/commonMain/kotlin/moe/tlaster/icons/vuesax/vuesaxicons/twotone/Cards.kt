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

public val TwotoneGroup.Cards: ImageVector
    get() {
        if (_cards != null) {
            return _cards!!
        }
        _cards = Builder(name = "Cards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.6099f)
                horizontalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 10.2798f)
                verticalLineTo(17.4298f)
                curveTo(18.97f, 20.2798f, 18.19f, 20.9998f, 15.22f, 20.9998f)
                horizontalLineTo(5.78f)
                curveTo(2.76f, 20.9998f, 2.0f, 20.2498f, 2.0f, 17.2698f)
                verticalLineTo(10.2798f)
                curveTo(2.0f, 7.5798f, 2.63f, 6.7098f, 5.0f, 6.5698f)
                curveTo(5.24f, 6.5598f, 5.5f, 6.5498f, 5.78f, 6.5498f)
                horizontalLineTo(15.22f)
                curveTo(18.24f, 6.5498f, 19.0f, 7.2998f, 19.0f, 10.2798f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.73f)
                verticalLineTo(13.72f)
                curveTo(22.0f, 16.42f, 21.37f, 17.29f, 19.0f, 17.43f)
                verticalLineTo(10.28f)
                curveTo(19.0f, 7.3f, 18.24f, 6.55f, 15.22f, 6.55f)
                horizontalLineTo(5.78f)
                curveTo(5.5f, 6.55f, 5.24f, 6.56f, 5.0f, 6.57f)
                curveTo(5.03f, 3.72f, 5.81f, 3.0f, 8.78f, 3.0f)
                horizontalLineTo(18.22f)
                curveTo(21.24f, 3.0f, 22.0f, 3.75f, 22.0f, 6.73f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 17.8101f)
                horizontalLineTo(6.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1094f, 17.8101f)
                horizontalLineTo(12.5494f)
            }
        }
        .build()
        return _cards!!
    }

private var _cards: ImageVector? = null
