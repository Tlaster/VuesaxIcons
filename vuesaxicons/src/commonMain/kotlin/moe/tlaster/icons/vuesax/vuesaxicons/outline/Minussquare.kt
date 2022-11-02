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

public val OutlineGroup.Minussquare: ImageVector
    get() {
        if (_minussquare != null) {
            return _minussquare!!
        }
        _minussquare = Builder(name = "Minussquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12.0f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8.0f, 11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12.0f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _minussquare!!
    }

private var _minussquare: ImageVector? = null
