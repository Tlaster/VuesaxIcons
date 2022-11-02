package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.75f)
                horizontalLineTo(9.9f)
                curveTo(5.57f, 19.75f, 4.25f, 18.43f, 4.25f, 14.1f)
                verticalLineTo(5.0f)
                curveTo(4.25f, 4.59f, 4.59f, 4.25f, 5.0f, 4.25f)
                horizontalLineTo(14.1f)
                curveTo(18.43f, 4.25f, 19.75f, 5.57f, 19.75f, 9.9f)
                verticalLineTo(19.0f)
                curveTo(19.75f, 19.41f, 19.41f, 19.75f, 19.0f, 19.75f)
                close()
                moveTo(5.75f, 5.75f)
                verticalLineTo(14.1f)
                curveTo(5.75f, 17.59f, 6.41f, 18.25f, 9.9f, 18.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(9.9f)
                curveTo(18.25f, 6.41f, 17.59f, 5.75f, 14.1f, 5.75f)
                horizontalLineTo(5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.75f)
                curveTo(4.59f, 5.75f, 4.25f, 5.41f, 4.25f, 5.0f)
                verticalLineTo(2.0f)
                curveTo(4.25f, 1.59f, 4.59f, 1.25f, 5.0f, 1.25f)
                curveTo(5.41f, 1.25f, 5.75f, 1.59f, 5.75f, 2.0f)
                verticalLineTo(5.0f)
                curveTo(5.75f, 5.41f, 5.41f, 5.75f, 5.0f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 5.75f, 1.25f, 5.41f, 1.25f, 5.0f)
                curveTo(1.25f, 4.59f, 1.59f, 4.25f, 2.0f, 4.25f)
                horizontalLineTo(5.0f)
                curveTo(5.41f, 4.25f, 5.75f, 4.59f, 5.75f, 5.0f)
                curveTo(5.75f, 5.41f, 5.41f, 5.75f, 5.0f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.75f)
                curveTo(18.59f, 22.75f, 18.25f, 22.41f, 18.25f, 22.0f)
                verticalLineTo(19.0f)
                curveTo(18.25f, 18.59f, 18.59f, 18.25f, 19.0f, 18.25f)
                curveTo(19.41f, 18.25f, 19.75f, 18.59f, 19.75f, 19.0f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.41f, 19.41f, 22.75f, 19.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.75f)
                horizontalLineTo(19.0f)
                curveTo(18.59f, 19.75f, 18.25f, 19.41f, 18.25f, 19.0f)
                curveTo(18.25f, 18.59f, 18.59f, 18.25f, 19.0f, 18.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 18.25f, 22.75f, 18.59f, 22.75f, 19.0f)
                curveTo(22.75f, 19.41f, 22.41f, 19.75f, 22.0f, 19.75f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
