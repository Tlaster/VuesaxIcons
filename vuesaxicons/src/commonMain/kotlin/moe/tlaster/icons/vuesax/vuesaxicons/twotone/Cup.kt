package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Cup: ImageVector
    get() {
        if (_cup != null) {
            return _cup!!
        }
        _cup = Builder(name = "Cup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1504f, 16.5f)
                verticalLineTo(18.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1504f, 22.0f)
                horizontalLineTo(17.1504f)
                verticalLineTo(21.0f)
                curveTo(17.1504f, 19.9f, 16.2504f, 19.0f, 15.1504f, 19.0f)
                horizontalLineTo(9.1504f)
                curveTo(8.0504f, 19.0f, 7.1504f, 19.9f, 7.1504f, 21.0f)
                verticalLineTo(22.0f)
                verticalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.1504f, 22.0f)
                horizontalLineTo(18.1504f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(8.13f, 16.0f, 5.0f, 12.87f, 5.0f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 3.79f, 6.79f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(17.21f, 2.0f, 19.0f, 3.79f, 19.0f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 12.87f, 15.87f, 16.0f, 12.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4691f, 11.6501f)
                curveTo(4.7191f, 11.4101f, 4.0591f, 10.9701f, 3.5391f, 10.4501f)
                curveTo(2.6391f, 9.4501f, 2.0391f, 8.2501f, 2.0391f, 6.8501f)
                curveTo(2.0391f, 5.4501f, 3.1391f, 4.3501f, 4.5391f, 4.3501f)
                horizontalLineTo(5.1891f)
                curveTo(4.9891f, 4.8101f, 4.8891f, 5.3201f, 4.8891f, 5.8501f)
                verticalLineTo(8.8501f)
                curveTo(4.8891f, 9.8501f, 5.0991f, 10.7901f, 5.4691f, 11.6501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5293f, 11.6501f)
                curveTo(19.2793f, 11.4101f, 19.9393f, 10.9701f, 20.4593f, 10.4501f)
                curveTo(21.3593f, 9.4501f, 21.9593f, 8.2501f, 21.9593f, 6.8501f)
                curveTo(21.9593f, 5.4501f, 20.8593f, 4.3501f, 19.4593f, 4.3501f)
                horizontalLineTo(18.8093f)
                curveTo(19.0093f, 4.8101f, 19.1093f, 5.3201f, 19.1093f, 5.8501f)
                verticalLineTo(8.8501f)
                curveTo(19.1093f, 9.8501f, 18.8993f, 10.7901f, 18.5293f, 11.6501f)
                close()
            }
        }
        .build()
        return _cup!!
    }

private var _cup: ImageVector? = null
