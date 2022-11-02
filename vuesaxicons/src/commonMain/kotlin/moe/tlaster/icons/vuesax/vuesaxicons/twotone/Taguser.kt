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

public val TwotoneGroup.Taguser: ImageVector
    get() {
        if (_taguser != null) {
            return _taguser!!
        }
        _taguser = Builder(name = "Taguser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.86f, 3.0f, 17.53f, 3.0f, 15.89f)
                verticalLineTo(4.97f)
                curveTo(3.0f, 3.33f, 4.34f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.0f, 21.0f, 3.33f, 21.0f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(21.0f, 17.52f, 19.66f, 18.86f, 18.0f, 18.86f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0691f, 8.9498f)
                curveTo(12.0291f, 8.9498f, 11.9691f, 8.9498f, 11.9191f, 8.9498f)
                curveTo(10.8691f, 8.9098f, 10.0391f, 8.0598f, 10.0391f, 6.9998f)
                curveTo(10.0391f, 5.9198f, 10.9091f, 5.0498f, 11.9891f, 5.0498f)
                curveTo(13.0691f, 5.0498f, 13.9391f, 5.9298f, 13.9391f, 6.9998f)
                curveTo(13.9491f, 8.0598f, 13.1191f, 8.9198f, 12.0691f, 8.9498f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2494f, 11.96f)
                curveTo(7.9194f, 12.85f, 7.9194f, 14.3f, 9.2494f, 15.19f)
                curveTo(10.7595f, 16.2f, 13.2395f, 16.2f, 14.7495f, 15.19f)
                curveTo(16.0795f, 14.3f, 16.0795f, 12.85f, 14.7495f, 11.96f)
                curveTo(13.2395f, 10.96f, 10.7695f, 10.96f, 9.2494f, 11.96f)
                close()
            }
        }
        .build()
        return _taguser!!
    }

private var _taguser: ImageVector? = null
