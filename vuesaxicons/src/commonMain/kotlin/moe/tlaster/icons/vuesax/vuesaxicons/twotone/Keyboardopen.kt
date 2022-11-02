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

public val TwotoneGroup.Keyboardopen: ImageVector
    get() {
        if (_keyboardopen != null) {
            return _keyboardopen!!
        }
        _keyboardopen = Builder(name = "Keyboardopen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2602f, 2.0f)
                horizontalLineTo(16.7302f)
                curveTo(17.3802f, 2.0f, 17.9602f, 2.02f, 18.4802f, 2.09f)
                curveTo(21.2502f, 2.4f, 22.0002f, 3.7f, 22.0002f, 7.26f)
                verticalLineTo(13.58f)
                curveTo(22.0002f, 17.14f, 21.2502f, 18.44f, 18.4802f, 18.75f)
                curveTo(17.9602f, 18.82f, 17.3902f, 18.84f, 16.7302f, 18.84f)
                horizontalLineTo(7.2602f)
                curveTo(6.6102f, 18.84f, 6.0302f, 18.82f, 5.5102f, 18.75f)
                curveTo(2.7402f, 18.44f, 1.9902f, 17.14f, 1.9902f, 13.58f)
                verticalLineTo(7.26f)
                curveTo(1.9902f, 3.7f, 2.7402f, 2.4f, 5.5102f, 2.09f)
                curveTo(6.0302f, 2.02f, 6.6102f, 2.0f, 7.2602f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5801f, 8.3198f)
                horizontalLineTo(17.2601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7402f, 14.1099f)
                horizontalLineTo(6.7602f)
                horizontalLineTo(17.2702f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1947f, 8.2998f)
                horizontalLineTo(7.2037f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4945f, 8.2998f)
                horizontalLineTo(10.5035f)
            }
        }
        .build()
        return _keyboardopen!!
    }

private var _keyboardopen: ImageVector? = null
