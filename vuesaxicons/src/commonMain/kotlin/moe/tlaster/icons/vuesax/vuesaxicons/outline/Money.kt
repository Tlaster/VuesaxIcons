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

public val OutlineGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.25f)
                horizontalLineTo(7.0f)
                curveTo(3.35f, 21.25f, 1.25f, 19.15f, 1.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 4.85f, 3.35f, 2.75f, 7.0f, 2.75f)
                horizontalLineTo(17.0f)
                curveTo(20.65f, 2.75f, 22.75f, 4.85f, 22.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.75f, 19.15f, 20.65f, 21.25f, 17.0f, 21.25f)
                close()
                moveTo(7.0f, 4.25f)
                curveTo(4.14f, 4.25f, 2.75f, 5.64f, 2.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.75f, 18.36f, 4.14f, 19.75f, 7.0f, 19.75f)
                horizontalLineTo(17.0f)
                curveTo(19.86f, 19.75f, 21.25f, 18.36f, 21.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(21.25f, 5.64f, 19.86f, 4.25f, 17.0f, 4.25f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.75f)
                curveTo(9.93f, 15.75f, 8.25f, 14.07f, 8.25f, 12.0f)
                curveTo(8.25f, 9.93f, 9.93f, 8.25f, 12.0f, 8.25f)
                curveTo(14.07f, 8.25f, 15.75f, 9.93f, 15.75f, 12.0f)
                curveTo(15.75f, 14.07f, 14.07f, 15.75f, 12.0f, 15.75f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 10.76f, 9.75f, 12.0f)
                curveTo(9.75f, 13.24f, 10.76f, 14.25f, 12.0f, 14.25f)
                curveTo(13.24f, 14.25f, 14.25f, 13.24f, 14.25f, 12.0f)
                curveTo(14.25f, 10.76f, 13.24f, 9.75f, 12.0f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 15.25f)
                curveTo(5.09f, 15.25f, 4.75f, 14.91f, 4.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(4.75f, 9.09f, 5.09f, 8.75f, 5.5f, 8.75f)
                curveTo(5.91f, 8.75f, 6.25f, 9.09f, 6.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(6.25f, 14.91f, 5.91f, 15.25f, 5.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 15.25f)
                curveTo(18.09f, 15.25f, 17.75f, 14.91f, 17.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(17.75f, 9.09f, 18.09f, 8.75f, 18.5f, 8.75f)
                curveTo(18.91f, 8.75f, 19.25f, 9.09f, 19.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(19.25f, 14.91f, 18.91f, 15.25f, 18.5f, 15.25f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
