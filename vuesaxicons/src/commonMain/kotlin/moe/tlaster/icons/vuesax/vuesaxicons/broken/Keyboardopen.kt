package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Keyboardopen: ImageVector
    get() {
        if (_keyboardopen != null) {
            return _keyboardopen!!
        }
        _keyboardopen = Builder(name = "Keyboardopen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.26f)
                curveTo(2.0f, 3.7f, 2.75f, 2.4f, 5.52f, 2.09f)
                curveTo(6.04f, 2.02f, 6.61f, 2.0f, 7.27f, 2.0f)
                horizontalLineTo(16.74f)
                curveTo(17.39f, 2.0f, 17.97f, 2.02f, 18.49f, 2.09f)
                curveTo(21.26f, 2.4f, 22.01f, 3.7f, 22.01f, 7.26f)
                verticalLineTo(13.58f)
                curveTo(22.01f, 17.14f, 21.26f, 18.44f, 18.49f, 18.75f)
                curveTo(17.97f, 18.82f, 17.4f, 18.84f, 16.74f, 18.84f)
                horizontalLineTo(7.27f)
                curveTo(6.62f, 18.84f, 6.04f, 18.82f, 5.52f, 18.75f)
                curveTo(2.75f, 18.44f, 2.0f, 17.14f, 2.0f, 13.58f)
                verticalLineTo(11.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5801f, 8.3201f)
                horizontalLineTo(17.2601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7402f, 14.1099f)
                horizontalLineTo(6.7602f)
                horizontalLineTo(17.2702f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1937f, 8.3f)
                horizontalLineTo(7.2027f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4945f, 8.3f)
                horizontalLineTo(10.5035f)
            }
        }
        .build()
        return _keyboardopen!!
    }

private var _keyboardopen: ImageVector? = null
